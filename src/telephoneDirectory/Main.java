package telephoneDirectory;

public class Main {
    public static void main(String[] args) {

        TelephoneDirectory telephoneDirectory=new TelephoneDirectory();
        telephoneDirectory.getMap().put("Иванов ИИ","+79600000001");
        telephoneDirectory.getMap().put("Котов","+79600000002");
        telephoneDirectory.getMap().put("Петров","+79600000003");
        telephoneDirectory.getMap().put("Сидоров","+79600000004");
        telephoneDirectory.getMap().put("Фролов","+79600000005");
        telephoneDirectory.getMap().put("Петроф","+796000000033");
        telephoneDirectory.getMap().put("Тихомиров А","+79600000001");
        telephoneDirectory.getMap().put("Савин И","+79600000001");
        telephoneDirectory.getMap().put("Точнов И","+79600000001");
        telephoneDirectory.getMap().put("Фрогин Ж","+79600000001");
        System.out.println(telephoneDirectory.toString());

    }
}
