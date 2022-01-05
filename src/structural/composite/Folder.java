package structural.composite;
import java.util.ArrayList;
import java.util.List;

public class Folder implements File {
    private String name;
    List<Video> videos=new ArrayList<>();
    List<Picture> pictures=new ArrayList<>();
    List<Folder> folders=new ArrayList<>();
    public Folder(){}

    public Folder(String name){
        this.name=name;
    }

    public Folder(List<Video> videos, List<Picture> pictures, List<Folder> folders) {
        this.videos = videos;
        this.pictures = pictures;
        this.folders = folders;
    }

    @Override
    public double getSize() {
        return calculateSize(this);
    }

    private double calculateSize(Folder folder) {
        double total=0;
        for(Video v:videos){
            total+=v.getSize();
        }
        for(Picture p:pictures){
            total+=p.getSize();
        }
        for(Folder f:folders){
            total+=f.getSize();
        }
        return total;
    }

}
