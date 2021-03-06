import static org.junit.jupiter.api.Assertions.assertEquals;

import domain.Student;
import domain.Tema;
import org.junit.jupiter.api.Test;
import repository.NotaXMLRepo;
import repository.StudentXMLRepo;
import repository.TemaXMLRepo;
import service.Service;
import validation.NotaValidator;
import validation.StudentValidator;
import validation.TemaValidator;
import validation.ValidationException;

public class Tests extends junit.framework.TestCase{

    @Test
    public void testaddStudentTescase_NegativeId() {
        StudentValidator studentValidator = new StudentValidator();
        TemaValidator temaValidator = new TemaValidator();
        String filenameStudent = "fisiere/Studenti.xml";
        String filenameTema = "fisiere/Teme.xml";
        String filenameNota = "fisiere/Note.xml";

        StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
        TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
        NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
        NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
        Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);


        Student std = new Student("-1","TestName",10,"test@testemail.com");

        try
        {
            service.addStudent(std);
            assert(false) : "Student with id -1 should not be added to repository!!!";
        }
        catch(ValidationException ex)
        {

        }

    }

    @Test
    public void testaddStudentTescase2() {
        StudentValidator studentValidator = new StudentValidator();
        TemaValidator temaValidator = new TemaValidator();
        String filenameStudent = "fisiere/Studenti.xml";
        String filenameTema = "fisiere/Teme.xml";
        String filenameNota = "fisiere/Note.xml";

        StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
        TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
        NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
        NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
        Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);


        Student std = new Student("string_id","TestName",10,"test@testemail.com");

        try
        {
            service.addStudent(std);
            assert(false) : "Student with string id should not be added to repository!!!";
        }
        catch(ValidationException ex)
        {

        }
    }

    @Test
    public void testaddStudentTestcase3_emptyName()
    {
        StudentValidator studentValidator = new StudentValidator();
        TemaValidator temaValidator = new TemaValidator();
        String filenameStudent = "fisiere/Studenti.xml";
        String filenameTema = "fisiere/Teme.xml";
        String filenameNota = "fisiere/Note.xml";

        StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
        TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
        NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
        NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
        Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

        Student std = new Student("100","",10,"test@testemail.com");

        try
        {
            service.addStudent(std);
            assert(false) : "Student with empty name should not be added to repository!!!";
        }
        catch(ValidationException ex)
        {

        }
    }

    @Test
    public void testaddStudentTestcase4_nullName()
    {
        StudentValidator studentValidator = new StudentValidator();
        TemaValidator temaValidator = new TemaValidator();
        String filenameStudent = "fisiere/Studenti.xml";
        String filenameTema = "fisiere/Teme.xml";
        String filenameNota = "fisiere/Note.xml";

        StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
        TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
        NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
        NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
        Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

        Student std = new Student("100",null,10,"test@testemail.com");

        try
        {
            service.addStudent(std);
            assert(false) : "Student with null name should not be added to repository!!!";
        }
        catch(ValidationException ex)
        {

        }
    }

    @Test
    public void testaddStudentTestcase5_negativeGroup()
    {
        StudentValidator studentValidator = new StudentValidator();
        TemaValidator temaValidator = new TemaValidator();
        String filenameStudent = "fisiere/Studenti.xml";
        String filenameTema = "fisiere/Teme.xml";
        String filenameNota = "fisiere/Note.xml";

        StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
        TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
        NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
        NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
        Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

        Student std = new Student("100","Gigel",-1,"test@testemail.com");

        try
        {
            service.addStudent(std);
            assert(false) : "Student with negative group should not be added to repository!!!";
        }
        catch(ValidationException ex)
        {

        }
    }

    @Test
    public void testaddStudentTestcase6_nullEmail()
    {
        StudentValidator studentValidator = new StudentValidator();
        TemaValidator temaValidator = new TemaValidator();
        String filenameStudent = "fisiere/Studenti.xml";
        String filenameTema = "fisiere/Teme.xml";
        String filenameNota = "fisiere/Note.xml";

        StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
        TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
        NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
        NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
        Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

        Student std = new Student("100","Gigel",100,null);

        try
        {
            service.addStudent(std);
            assert(false) : "Student with null email should not be added to repository!!!";
        }
        catch(ValidationException ex)
        {

        }
    }

    @Test
    public void testaddStudentTestcase7_emptyEmail()
    {
        StudentValidator studentValidator = new StudentValidator();
        TemaValidator temaValidator = new TemaValidator();
        String filenameStudent = "fisiere/Studenti.xml";
        String filenameTema = "fisiere/Teme.xml";
        String filenameNota = "fisiere/Note.xml";

        StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
        TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
        NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
        NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
        Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

        Student std = new Student("100","Gigel",100,"");

        try
        {
            service.addStudent(std);
            assert(false) : "Student with null email should not be added to repository!!!";
        }
        catch(ValidationException ex)
        {

        }
    }

    @Test
    public void testaddTemaWithDeadlineBeforePrimire()
    {
        StudentValidator studentValidator = new StudentValidator();
        TemaValidator temaValidator = new TemaValidator();
        String filenameStudent = "fisiere/Studenti.xml";
        String filenameTema = "fisiere/Teme.xml";
        String filenameNota = "fisiere/Note.xml";

        StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
        TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
        NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
        NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
        Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

        Tema tema = new Tema("10","descriere", 9,  8);


        try
        {
            service.addTema(tema);
        }
        catch(ValidationException ex)
        {
            assert(false) : "Team with primire greater than deadline invalid";
        }
    }

    @Test
    public void testaddTemaWithNullDescription()
    {
        StudentValidator studentValidator = new StudentValidator();
        TemaValidator temaValidator = new TemaValidator();
        String filenameStudent = "fisiere/Studenti.xml";
        String filenameTema = "fisiere/Teme.xml";
        String filenameNota = "fisiere/Note.xml";

        StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
        TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
        NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
        NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
        Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

        Tema tema = new Tema("10","", 9,  10);


        try
        {
            service.addTema(tema);
            assert(false) : "Team with descriere null invalid";
        }
        catch(ValidationException ex)
        {

        }
    }

    @Test
    public void testaddTemaCoverage()
    {
        StudentValidator studentValidator = new StudentValidator();
        TemaValidator temaValidator = new TemaValidator();
        String filenameStudent = "fisiere/Studenti.xml";
        String filenameTema = "fisiere/Teme.xml";
        String filenameNota = "fisiere/Note.xml";

        StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
        TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
        NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
        NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
        Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);

        Tema tema0 = new Tema(null,"blabla", 10,  10);
        Tema tema1 = new Tema("","blabla", 10,  10);


        Tema tema2 = new Tema("10","blabla", 9,  10);
        Tema tema3 = new Tema("10","blabla", 9,  10);

        Tema tema4 = new Tema("12","blabla", 9,  20);

        Tema tema5 = new Tema("13","blabla", 20,  10);

        Tema tema6 = new Tema("14", "blabla", 10, 10);

        try
        {
            service.addTema(tema0);
            service.addTema(tema1);
            assert(false) : "Numar tema invalid!";
        }
        catch(ValidationException ex)
        {

        }
        try
        {
            service.addTema(tema2);
            service.addTema(tema3);
            assert(false) : "Tema with id already exists.";
        }
        catch(ValidationException ex)
        {

        }
        try
        {
            service.addTema(tema4);
            assert(false) : "Saptamana primirii trebuie sa fie intre 1-14.";
        }
        catch(ValidationException ex)
        {

        }
        try
        {
            service.addTema(tema5);
            assert(false) : "Deadline intre 1-14.";
        }
        catch(ValidationException ex)
        {

        }
        try
        {
            service.addTema(tema6);
            assert(true) : "Tema buna..";
        }
        catch(ValidationException ex)
        {

        }
    }

}