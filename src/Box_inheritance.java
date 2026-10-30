class Box{
 double width;
 double length;
 double height;

 Box(Box object){
    width=object.width;
    length=object.length;
    height=object.height;
 }
 Box(double w, double l, double h){
     width=w;
     length=l;
     height=h;
 }
 double volume(){
     return width*length*height;
 }
}
class Boxweight extends Box{
    Boxweight(double w, double l, double h) {
        super(w, l, h);
    }
}

class Box_inheritance{
    public static void main(String [] args){
        Boxweight b1= new Boxweight(10, 5, 7);
        Box b2=new Box(b1);

        System.out.println("Volume of b1 is:"+ b1.volume());
        System.out.println("Volume of b2 is:"+ b2.volume());

    }

}