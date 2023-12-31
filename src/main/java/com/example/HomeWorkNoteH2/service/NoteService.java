package com.example.HomeWorkNoteH2.service;

import com.example.HomeWorkNoteH2.dto.NoteDto;
import com.example.HomeWorkNoteH2.dto.NoteWithUsernameDto;
import com.example.HomeWorkNoteH2.exception.NoteNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

public interface NoteService {

    List<NoteDto> listAll();

    List<NoteWithUsernameDto> listAllUserNotes(Long userId);
    List<NoteWithUsernameDto> listAllUserNotes1(Long userId);

    NoteDto add(NoteDto note);

    List<NoteDto> addAll(Collection<NoteDto> notes);

    @Transactional
    void deleteById(UUID id) throws NoteNotFoundException;

    void update(NoteDto note) throws NoteNotFoundException;

    NoteDto getById(UUID id) throws NoteNotFoundException;
    NoteDto getByTitle(String title) throws NoteNotFoundException;

}
