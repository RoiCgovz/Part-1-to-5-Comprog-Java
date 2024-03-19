package Chapter25;
public class LogTable {
    public static void main(String[] args) {
        
        System.out.println("<html>");
        System.out.println("<body>");
        System.out.println("<table>");
        System.out.println("<tr><th>x</th><th>ln(x)</th></tr>");

        for (double x = 0.1; x <=2.0; x += 0.1)
        {
            System.out.println("<tr><td>" + x + "</td><td>" + Math.log(x) + "</td></tr>");
        }

        System.out.println("</table>");
        System.out.println("</body>");
        System.out.println("</html>");
    }
}
