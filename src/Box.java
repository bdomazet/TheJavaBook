class Box {


    double width;
    double hight;
    double depth;
    /*
    //method - display volume of a box
    void volume(){
        System.out.print("Volume is: ");
        System.out.println(width * hight * depth);
    }
    */
    //method that return the value

    double volume(){
        return width * hight * depth;
    }

    void setDim (double w, double h, double d){
        width = w;
        hight = h;
        depth = d;
    }

    void meth(){
        System.out.print("Visina puta duzina: ");
        System.out.println(width * hight);
        System.out.println("Sad printam tacke");
        System.out.println(". . . . . . . . .");

    }
}
