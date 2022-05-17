package filesSystem;

import static java.lang.Math.round;

public class StatisticsDisplayVisitor implements FileVisitor{
    @Override
    public void visit(DocxFileDetails docxFileDetails) {
        int temp = round((float)docxFileDetails.getWords()/docxFileDetails.getPages());
        System.out.println("The file "+ docxFileDetails.getName() + " has an average of " + temp + " words per page.");
    }

    @Override
    public void visit(DirectoryDetails directoryDetails) {
        FileCountDisplayVisitor fcVisitor = new FileCountDisplayVisitor();
        directoryDetails.accept(fcVisitor);
        System.out.println("Directory " + directoryDetails.getName() /*folder2*/ +" has "+ fcVisitor.getCounter()/*1*/+" files.");
    }

    @Override
    public void visit(HtmlFileDetails htmlFileDetails) {
        System.out.println("The file " + htmlFileDetails.getName()/*other.html*/ + " contains " + htmlFileDetails.getLines()/*128*/ +" lines.");
    }

    @Override
    public void visit(JpgFileDetails jpgFileDetails) {
        int temp = round((float)jpgFileDetails.getSize() / (jpgFileDetails.getHeight()*jpgFileDetails.getWidth()));
        System.out.println("The picture "+jpgFileDetails.getName()/*icon.jpg*/ +" has an average of " + temp /*1*/+" bytes per pixel.");
    }

    @Override
    public void visit(Mp3FileDetails mp3FileDetails) {
        int temp = round((float)mp3FileDetails.getSize() / mp3FileDetails.getLengthSec());
        System.out.println("The bitrate of " + mp3FileDetails.getName()/*song.mp3*/ +" is "+ temp/*22*/ + " bytes per second.");
    }

    @Override
    public void visit(PptxFileDetails pptxFileDetails) {
        int temp = round((float)pptxFileDetails.getSize() / pptxFileDetails.getSlides());
        System.out.println("The average slide size in Presentation " + pptxFileDetails.getName()/*Swed.pptx*/ + " is "+temp/*20020*/ +".");
    }

    @Override
    public void visit(TxtFileDetails txtFileDetails) {
        System.out.println("The file "+ txtFileDetails.getName()+ " contains " + txtFileDetails.getWords()+ " words.");
    }
}
