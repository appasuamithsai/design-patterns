package structural.composite;

public class Picture implements File{
    private  double size;
    private String name;
    public Picture(String name,double size) {
        this.name=name;
        this.size = size;
    }

    @Override
    public double getSize() {
        return size;
    }

    public String getName(){
        return name;
    }

}
