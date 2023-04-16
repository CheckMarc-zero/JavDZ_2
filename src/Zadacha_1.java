import java.util.HashMap;
import java.util.Map;

public class Zadacha_1 {
    public static void main(String[] args) {
        Map<String, String> params1 = new HashMap<String,String>();
        params1.put("name","Ivanov");
        params1.put("country","Russia");
        params1.put("city","Moscow");
        params1.put("age",null);
        System.out.println(getQuery(params1));
    }
    public static String getQuery(Map<String, String> params)
    {
        StringBuilder s = new StringBuilder();
        for (Map.Entry<String,String> pair : params.entrySet())
        {
            if (pair.getValue() != null)
            {
                s.append(pair.getKey() +": '" + pair.getValue()+ "'; ");
            }
        }
       // s.delete(s.toString().length()-1,s.toString().length());
        return s.toString();
    }


}
