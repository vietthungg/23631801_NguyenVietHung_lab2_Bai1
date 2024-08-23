package iuh.fit.ktpm;


public class Rectangle {
    private double length;
    private double width;

    /**
     *  khỏi tạo ban đầu
     */
    public Rectangle() {
        this.length = 0.0;
        this.width = 0.0;
    }

    /**
     * nếu chiều dài và chiều rộng không thoả mãn điều kiện thì in ra "Length and width must be greater than 0"
     */

    public Rectangle(double l, double w) {
        if (!(l < 0.0) && !(w < 0.0)) {
            this.length = l;
            this.width = w;
        } else {
            throw new IllegalArgumentException("Length and width must be greater than 0");
        }
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    /**
     * thiết lập giá trị của chiều dài
     * @param
     */
    public void setLength(double length) {
        if (length < 0.0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        } else {
            this.length = length;
        }
    }

    /**
     * thiết lập giá trị của chiều dài
     * @param
     */
    public void setWidth(double width) {
        if (width < 0.0) {
            throw new IllegalArgumentException("Width must be greater than 0");
        } else {
            this.width = width;
        }
    }

    /**
     * tính diện tích hình chữ nhật
     * @return
     */
    public double getArea() {
        return this.length * this.width;
    }

    /**
     * tính chu vi hình chữ nhật
     * @return
     */
    public double getPerimeter() {
        return 2.0 * (this.length + this.width);
    }
}

