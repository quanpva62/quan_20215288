import javax.swing.JOptionPane;

public class ChoosingOption {

    public static void main(String[] args) {
        // Tạo các tùy chọn
        Object[] options = {"I do", "I don't"};

        // Hiển thị hộp thoại với các tùy chọn tùy chỉnh
        int option = JOptionPane.showOptionDialog(null,
                "Do you want to change to the first class ticket?",
                "Choose an option",
                JOptionPane.YES_NO_OPTION, // Bạn có thể thay đổi tham số này
                JOptionPane.QUESTION_MESSAGE,
                null, // Biểu tượng, có thể để null
                options, // Mảng các tùy chọn tùy chỉnh
                options[0]); // Tùy chọn mặc định

        // Hiển thị kết quả
        if (option == 0) {
            JOptionPane.showMessageDialog(null, "You've chosen: I do");
        } else if (option == 1) {
            JOptionPane.showMessageDialog(null, "You've chosen: I don't");
        } else {
            JOptionPane.showMessageDialog(null, "No selection made");
        }

        System.exit(0);
    }

}