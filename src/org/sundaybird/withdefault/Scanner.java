package org.sundaybird.withdefault;

import org.sundaybird.common.Document;

public interface Scanner {
    default Document scan() {
        return new Document();
    }
}
