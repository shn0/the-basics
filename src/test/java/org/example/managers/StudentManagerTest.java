package org.example.managers;

import org.example.models.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentManagerTest {

    @Test
    void addStudent_increasesSize_andStoresCorrectly() {
        StudentManager m = new StudentManager();
        m.addStudent(new Student("Alice", 20, 95.5));

        assertEquals(1, m.size());
        assertEquals("Alice", m.getAllStudents().get(0).getName());
    }

    @Test
    void addStudent_null_throws() {
        StudentManager m = new StudentManager();
        assertThrows(IllegalArgumentException.class, () -> m.addStudent(null));
    }

    @Test
    void findByName_returnsStudent_whenExists() {
        StudentManager m = new StudentManager();
        Student s1 = new Student("Bob", 22, 88.0);
        m.addStudent(s1);

        Student found = m.findByName("bob"); // case-insensitive
        assertNotNull(found);
        assertEquals("Bob", found.getName());
        assertSame(s1, found);
    }

    @Test
    void findByName_returnsNull_whenMissingOrNullName() {
        StudentManager m = new StudentManager();
        m.addStudent(new Student("Diana", 21, 92.0));

        assertNull(m.findByName("Eve"));
        assertNull(m.findByName(null));
    }

    @Test
    void printAllStudents_doesNotThrow() {
        StudentManager m = new StudentManager();
        m.addStudent(new Student("Eva", 20, 80.0));
        m.addStudent(new Student("Frank", 19, 78.5));

        assertDoesNotThrow(m::printAllStudents);
        assertEquals(2, m.size());
    }
}
