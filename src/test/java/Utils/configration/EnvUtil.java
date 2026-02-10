package Utils.configration;

import java.io.IOException;
import java.util.Properties;
/*
 * 🌍 EnvUtil Class (مدير البيئات - Singleton)
 * ---------------------------------------------------------
 * 💡 الفكرة:
 * الكلاس ده بيطبق مبدأ الـ Singleton، يعني بيضمن إننا عندنا نسخة واحدة بس
 * من إعدادات البيئة (Environment Config) شغالة طول الوقت.
 *
 * ⚙️ بيعمل إيه؟
 * 1. Constructor Private 🔒: عشان يمنع أي حد يعمل Object منه عمال على بطال.
 * 2. جوا الكونستراكتور: بيقرر إحنا Staging ولا Production ويحمل الملف الصح.
 * 3. getInstance 👮‍♂️: دي الطريقة الوحيدة عشان تنادي عليه. لو هو مش موجود بيعمله،
 * ولو موجود بيستخدم القديم (عشان نوفر ميموري ومجهود قراءة ملفات).
 * ---------------------------------------------------------
 */
public class EnvUtil {

    static Properties prop ;
    public static EnvUtil envUtil ;

    /*
    * ليه برايفت؟ 🔒 عشان يقفل الباب! محدش من بره الكلاس يقدر يكتب new EnvUtil().
    *  هو بيقولك: "أنا اللي هعمل نفسي بنفسي، ملكش دعوة إنت"
    * */
    private EnvUtil() throws IOException {
        /*
        * جواه بيعمل إيه؟ بيشوف إنت باعتله كلمة "staging" ولا "production"،
        *  وبناءً عليها يروح يقرأ ملف الـ Properties
        * المناسب باستخدام الكلاس اللي فات (ConfigUtil)
        * */


        String env = System.getProperty("env","staging");
        switch (env)
        {
            case "staging":
               prop = ConfigUtil.ReadConfig("D:\\New folder\\cucumber-to-do-project\\src\\test\\resources\\properties\\Staging.properties");
                break;
            case "production":
               prop = ConfigUtil.ReadConfig("D:\\New folder\\cucumber-to-do-project\\src\\test\\resources\\properties\\Production.properties");
                break;
            default:
                throw new RuntimeException("env not supported");
        }
    }

    /*
    * ده "المدير" 👮‍♂️:
الدالة دي بتقول: "يا جماعة، لو الختم لسه مش موجود (null)،
*  أنا هنزل أشتريه (new EnvUtil). لو موجود، خلاص استخدموا اللي موجود".
ده بيضمن إن ملف الإعدادات يتفتح ويتقرأ مرة واحدة بس في حياة البرنامج كله
    * */
    public static EnvUtil getInstance() throws IOException {
        if (envUtil == null){
            envUtil = new EnvUtil();
        }
        return envUtil ;
    }

    // لازم تكون static عشان تناديها من غير new
    public static String getProperty(String key) throws IOException {
        getInstance(); // اتأكد إن الشنطة موجودة

        // دور على المفتاح
        String value = prop.getProperty(key);

        // لو ملقاش المفتاح، اصرخ وقولنا!
        if (value == null) {
            throw new RuntimeException("❌ الحق يا هندسة! المفتاح اللي اسمه [" + key + "] مش موجود في ملف الـ properties!");
        }

        return value;
    }

}
