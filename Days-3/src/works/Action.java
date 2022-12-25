package works;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Array;

public class Action {
    int age = 30;
    //no parameter and no return
    public void noParameter(){
        System.out.println("noParameter Call");

    }
    // no return
    public void noReturn(String data, int age){
        System.out.println(data + " : "+ age);
    }
    // Return
    public int  size(String data){
        return data.length();
    }

    // array parameter function
    public String arrFunc(Object[] objects){
        String data = "";
        for (Object item: objects){
            if(item instanceof String){
                String str = String.valueOf(item);
                data += str + " ";
            }
        }
        return data;
    }
    // All params

    /**
     * Kullanıcıdan gelen adres satırlarının eklenerek yazılmasını sağlar.
     * @param str String..
     * @return String
     */
    public String addressLines( String... str ){
        String data = "";
        for ( String item:str ){
            data += item + " ";
        }
        return data;
    }

    // Object Function
    public String useSettings(Settings settings){
        String name = settings.profileName(10);
        return name;
    }
}
