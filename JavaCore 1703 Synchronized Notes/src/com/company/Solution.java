package com.company;

/*

1703 Synchronized Notes
1. The Note class will be used by threads. So make calls to the notes sheet block the notes mutex, not this
2. All System.out.println should not be blocked (synchronized), ie must not be in a synchronized block

Requirements:
1. The addNote () method should add notes to the notes list.
2. The removeNote () method should remove the note from the notes list.
3. The addNote () method must contain a synchronized block.
4. The synchronized block must be in the removeNote () method.
5. The synchronized block in the addNote () method should block the notes mutex.
6. The synchronized block in the removeNote () method should block the notes mutex.
7. The synchronized block of the addNote () method should contain a call to the add method of notes.
8. The synchronized block of the removeNote () method should contain a call to the remove method of notes.
9. All display commands should not be in the synchronized block.


 */


import java.util.ArrayList;
import java.util.List;

/*
Синхронизированные заметки
*/
public class Solution {

    public static void main(String[] args) {

    }

    public static class Note {

        public final List<String> notes = new ArrayList<String>();

        public void addNote(int index, String note) {
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
            synchronized (notes) {
                notes.add(index, note);
            }
            System.out.println("Уже добавлена заметка [" + note + "]");
        }

        public void removeNote(int index) {
            String note;
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            synchronized (notes) {
                note = notes.remove(index);
            }
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
        }
    }

}







