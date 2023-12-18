package com.example.HomeWorkNoteH2.projection;

import java.util.UUID;

public interface NoteWithUserNameProj {

    UUID getNoteId();
    String getTitle();
    String getContent();
    String getUsername();
}
