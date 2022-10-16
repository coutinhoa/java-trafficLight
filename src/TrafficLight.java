public class TrafficLight {

    private String colour;

    public TrafficLight (){
        colour = "red";
    }//we don't have to pass arguments because we want all
    //traffic lights to start with red, otherwise we would have to give argument colour

    public String getColour(){
        return colour;
    }

    public void next(){
        if(colour.equals("red"))
            { this.colour="green";}
        else if (colour.equals("green")){this.colour= "yellow";}
        else if (colour.equals("yellow")){this.colour= "red";}
    }


}
