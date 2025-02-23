package claseSystem;

import java.util.Map;

public class VariablesDeEntorno {
    public static void main(String[] args) {
        Map<String,String> varEnv = System.getenv();
        System.out.println("Variable de ambiente del sistema = " + varEnv);

        for(String key: varEnv.keySet()){
            System.out.println(key + " => " + varEnv.get(key));
        }
    }
}
