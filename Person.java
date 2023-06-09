public abstract class Person {
    protected String name = "";
    protected String nach_name = "";
    protected String buerger_id = "";
    protected int alter = 0;

    public Person(String name, String nach_name, String buerger_id, int alter){
        this.name = name;
        this.nach_name = nach_name;
        this.buerger_id = buerger_id;
        this.alter = alter;
    }
    public Person(String buerger_id){
        this.buerger_id = buerger_id;
    }

    public void setAlter(int alter){
        if( alter >= 0 && alter <= 120){
            this.alter = alter;
        }
    }

    @Override
    public String toString(){
        return "Buerger ID : " + getBuerger_id() + "\nName : " + getName() + " " + getNachname()
                + "\nAge : " + getAlter();
    }

    @Override
    public boolean equals(Object obj){
        Person object = (Person) obj;
        if (getBuerger_id().equals(object.getBuerger_id())){
            return true;
        }
        return false;
    }



    public static boolean chechNachname(String nachname){
        return (nachname.length() >= 2);
    }
    public static boolean checkName(String name){
        if (name.length() < 2){
            System.out.println("Names must contain at least 2 letter.");
            return false;
        }
        for (int i = 0; i < name.length(); i++){
            if (!Character.isAlphabetic(name.charAt(i)) && name.charAt(i) !=' ' && name.charAt(i) != '.'){
                System.out.println("Names can only consist of letters, periods, and spaces.");
                return false;
            }
        }
        return true;
    }
    public static boolean checkBuergerID(String bId){
        if (bId.length() < 7){
            System.out.println("BuergerID must consist of 7 digits.");
            return false;
        }
        else if (bId.charAt(0) == '0'){
            System.out.println("First digit cannot be zero.");
            return false;
        }
        for (int i = 0;i < bId.length(); i++){
            if (!Character.isDigit(bId.charAt(i))){
                System.out.println("Please enter number only.");
                return false;
            }
        }
        return true;
    }
    public int getAlter(){
        return this.alter;
    }

    public void setBuerger_id(String buerger_id){
        this.buerger_id = buerger_id;
    }

    public String getBuerger_id(){
        return this.buerger_id;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    
    public void setNach_name(String nach_name){
        this.nach_name = nach_name;
    }

    public String getNachname(){
        return this.nach_name;
    }
}
