package mementoPattern;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        VersionControl versionControl = new VersionControl();

        doc.setContent("Version 1: Hello World!");
        versionControl.saveVersion(doc.save());

        doc.setContent("Version 2: Hello Design Patterns!");
        versionControl.saveVersion(doc.save());

        doc.setContent("Version 3: Goodbye World!");
        versionControl.saveVersion(doc.save());

        System.out.println("Current content: " + doc.getContent());

        versionControl.listVersions(); // List all saved versions

        doc.restore(versionControl.getVersion(0));
        System.out.println("Restored content: " + doc.getContent());
    }
}

