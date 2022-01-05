package structural.composite;
/*
                                        Composite Design Pattern
  Composite Design Pattern is a structural design pattern that forms a tree structure where each node in the tree is a container of
multiple object and consumer can treat each container , a single object behaving the same way as that of its inner object.

 */

import java.util.ArrayList;
import java.util.List;

public class User {
    public static void main(String[] args) {
        List<Folder> folderList=new ArrayList<>();
        List<Video> videoList=new ArrayList<>();
        List<Picture>  pictureList=new ArrayList<>();

        folderList.add(new Folder("docx"));
        folderList.add(new Folder("download"));
        folderList.add(new Folder("desktop"));

        videoList.add(new Video("video1",100));
        videoList.add(new Video("video2",200));
        videoList.add(new Video("video3",300));

        pictureList.add(new Picture("img1",10));
        pictureList.add(new Picture("img2",20));
        pictureList.add(new Picture("img3",30));

        Folder folder=new Folder(videoList,pictureList,folderList);

        double folderSize=folder.getSize();
        System.out.println(folderSize);
    }
}
