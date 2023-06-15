package k;

public enum Season implements Detail{
    SPRING("String"){public String info(){return "STRING";}},
    SUMMER("Summer"){public String info(){return "SUMMER";}},
    FALL("Fall"){public String info(){return "FALL";}},
    WINTER("Winter"){public String info(){return "WINTER";}};
    public String name;
    public String infoDetail()
    {
        return "SEASON";
    }
    private Season(String name)
    {
        this.name = name;
    }
}

interface Detail
{
    String info();
    String infoDetail();
}

