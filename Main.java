package QuanLySanPham;
import QuanLySanPham.Product;
import James_Module2.DemoSp;
import java.util.ArrayList;
import java.util.Scanner;

import static QuanLySanPham.Product.addProduct;
import static QuanLySanPham.Product.displayProducts;

public class Main {
    String name;
    double price;
    int quantity;

    static ArrayList<DemoSp> productList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DemoSp sp1 = new DemoSp("ipad 5 1TB", 12000000, 3);
        DemoSp sp2 = new DemoSp("Laptop Acer", 3400000, 12);
        while (true) {
            System.out.println("Quản lý sản phẩm");
            System.out.println("1. Hiển thị sản phẩm");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Thoát");
            System.out.print("Chọn một chức năng: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayProducts();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
