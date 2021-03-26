import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        final BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String[] input = read.readLine().split(" ");

        final int squareMaxX = Integer.parseInt(input[0]);
        final int squareMaxY = Integer.parseInt(input[1]);

        while ((input = read.readLine().split(" ")) != null) {
            int roverX = Integer.parseInt(input[0]);
            int roverY = Integer.parseInt(input[1]);

            //W x--
            //E x++
            //N y++
            //S y--
            char direction = input[2].toCharArray()[0];

            //System.out.println(direction);

            String commands = read.readLine();

            int aux = 0;

            for (char ch : commands.toCharArray()) {
                switch (ch) {
                    case 'L':
                        if (direction == 'N') {
                            direction = 'W';
                        } else if (direction == 'W') {
                            direction = 'S';
                        } else if (direction == 'S') {
                            direction = 'E';
                        } else if (direction == 'E') {
                            direction = 'N';
                        }
                        break;
                    case 'R':
                        if (direction == 'N') {
                            direction = 'E';
                        } else if (direction == 'E') {
                            direction = 'S';
                        } else if (direction == 'S') {
                            direction = 'W';
                        } else if (direction == 'W') {
                            direction = 'N';
                        }
                        break;
                    case 'M':
                        if (direction == 'N') {
                            roverY++;
                        } else if (direction == 'E') {
                            roverX++;
                        } else if (direction == 'S') {
                            roverY--;
                        } else if (direction == 'W') {
                            roverX--;
                        }
                        break;
                }
            }
            
            System.out.println(roverX + " " + roverY + " " + direction);
        }
    }
}
