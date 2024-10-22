package mementoPattern;

import java.util.ArrayList;
import java.util.List;

public class VersionControl {
    private List<DocumentVersion> versionHistory = new ArrayList<>();

    public void saveVersion(DocumentVersion version) {
        versionHistory.add(version);
    }

    public DocumentVersion getVersion(int index) {
        if (index >= 0 && index < versionHistory.size()) {
            return versionHistory.get(index);
        } else {
            System.out.println("Invalid version index.");
            return null;
        }
    }

    public void listVersions() {
        for (int i = 0; i < versionHistory.size(); i++) {
            System.out.println("Version " + (i + 1) + ": " + versionHistory.get(i).getContent());
        }
    }
}

