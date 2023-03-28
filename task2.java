import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class StudentGrades {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("grades.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] fields = line.split("[,:]");

            String surname = fields[1];
            String mark = fields[3];
            String subject = fields[5];

            StringBuilder builder = new StringBuilder();
            builder.append("Студент ");
            builder.append(surname);
            builder.append(" получил ");
            builder.append(mark);
            builder.append(" по предмету ");
            builder.append(subject);
            builder.append(".");
            System.out.println(builder.toString());
        }
        scanner.close();
    }
}
