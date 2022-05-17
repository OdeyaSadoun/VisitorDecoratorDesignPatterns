package filesSystem;

import java.util.ArrayList;
import java.util.List;

// TODO: Implement Composite (change this file).
public class DirectoryDetails extends FileDetails {

    List<FileDetails> elements = null;
    public DirectoryDetails(String path, String name){
        super(path,name);
        elements = new ArrayList<>();
    }

//    FileDetails itsFile = new FileDetails();


    @Override
    public void accept(FileVisitor fileVisitor) {
        for (FileDetails file:elements) {
            file.accept(fileVisitor);
        }
        fileVisitor.visit(this);
    }

    public void addFile(FileDetails fileDetails){
        // TODO: complete
        elements.add(fileDetails);
    }
}