package question1;
public class FahrenheitCelsius {
    public static void main(String[] args) {
        
        int fahrenheit=(String)f.getText;
    
        float celsius=Float.parseFloat(f);
    
        System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
                                                                             // format
                                                                                // imposés
                                                                                
    }
    public static float fahrenheitEnCelsius(int f) {
        String s=Integer.toString(f);
        f=Integer.parseInt((String)s);
        f=(f-32)*5/9;
        return f;
    }

}
