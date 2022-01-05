package structural.composite;

public class Video implements File{
    private  double size;
    private String name;
    public Video(String name,double size) {
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
