package filesSystem;

public class ShortPrintDispalyVisitor implements FileVisitor{
    @Override
    public void visit(DocxFileDetails docxFileDetails)
    {
        System.out.println(docxFileDetails.getName());
    }

    @Override
    public void visit(DirectoryDetails directoryDetails)
    {
        System.out.println(directoryDetails.getName());
    }

    @Override
    public void visit(HtmlFileDetails htmlFileDetails)
    {
        System.out.println(htmlFileDetails.getName());
    }
    @Override
    public void visit(JpgFileDetails jpgFileDetails)
    {
        System.out.println(jpgFileDetails.getName());
    }

    @Override
    public void visit(Mp3FileDetails mp3FileDetails)
    {
        System.out.println(mp3FileDetails.getName());
    }

    @Override
    public void visit(PptxFileDetails pptxFileDetails)
    {
        System.out.println(pptxFileDetails.getName());
    }

    @Override
    public void visit(TxtFileDetails txtFileDetails)
    {
        System.out.println(txtFileDetails.getName());
    }
}
