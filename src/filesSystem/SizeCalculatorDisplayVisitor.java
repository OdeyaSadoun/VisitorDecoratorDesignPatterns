package filesSystem;

public class SizeCalculatorDisplayVisitor implements FileVisitor
{
    int size=0;
    public int getSize(){return size;}
    @Override
    public void visit(DocxFileDetails docxFileDetails)
    {
        size+=docxFileDetails.getSize();
    }

    @Override
    public void visit(DirectoryDetails directoryDetails)
    {
    }

    @Override
    public void visit(HtmlFileDetails htmlFileDetails)
    {
        size+=htmlFileDetails.getSize();
    }

    @Override
    public void visit(JpgFileDetails jpgFileDetails)
    {
        size+=jpgFileDetails.getSize();
    }

    @Override
    public void visit(Mp3FileDetails mp3FileDetails)
    {
        size+=mp3FileDetails.getSize();
    }

    @Override
    public void visit(PptxFileDetails pptxFileDetails)
    {
        size+=pptxFileDetails.getSize();
    }

    @Override
    public void visit(TxtFileDetails txtFileDetails)
    {
        size+=txtFileDetails.getSize();
    }
}