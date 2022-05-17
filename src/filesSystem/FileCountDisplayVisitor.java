package filesSystem;

public class FileCountDisplayVisitor implements FileVisitor{
    int counter = 0;
    public int getCounter(){return  counter;}
    @Override
    public void visit(DocxFileDetails docxFileDetails) {
        counter++;
    }

    @Override
    public void visit(DirectoryDetails directoryDetails) {
    }

    @Override
    public void visit(HtmlFileDetails htmlFileDetails) {
        counter++;
    }

    @Override
    public void visit(JpgFileDetails jpgFileDetails) {
        counter++;
    }

    @Override
    public void visit(Mp3FileDetails mp3FileDetails) {
        counter++;
    }

    @Override
    public void visit(PptxFileDetails pptxFileDetails) {
        counter++;
    }

    @Override
    public void visit(TxtFileDetails txtFileDetails) {
        counter++;
    }
}
