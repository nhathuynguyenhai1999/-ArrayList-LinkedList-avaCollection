package QuanLySanPham;

import James_Module2.DemoSp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Product {
    public static ArrayList<DemoSp> productList = new ArrayList<>();

    public static void displayProducts() {
        System.out.println("Danh sách sản phẩm:");
        for (DemoSp product : productList) {
            System.out.println("Tên: " + product.getName());
            System.out.println("Giá: " + product.getPrice());
            System.out.println("Số lượng: " + product.getQuantity());
            System.out.println("---------------------");
        }
    }

    public static void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.next();
        System.out.print("Nhập giá sản phẩm: ");
        double price = scanner.nextDouble();
        System.out.print("Nhập số lượng sản phẩm: ");
        int quantity = scanner.nextInt();

        DemoSp newProduct = new DemoSp(name, price, quantity);
        productList.add(newProduct);
        System.out.println("Sản phẩm đã được thêm vào danh sách.");
    }

    public static void deleteProduct(int deleteProductId) {
        Iterator<DemoSp> iterator = productList.iterator();
        while (iterator.hasNext()) {
            DemoSp product = iterator.next();
            if (product.getId() == deleteProductId) {
                iterator.remove();
                System.out.println("Sản phẩm đã được xóa thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm với ID: " + deleteProductId);
    }

    public static void editProduct(int editProductId, String newName, double newPrice) {
        for (DemoSp product : productList) {
            if (product.getId() == editProductId) {
                product.setName(newName);
                product.setPrice(newPrice);
                System.out.println("Sản phẩm đã được cập nhật thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm với ID: " + editProductId);
    }
}


