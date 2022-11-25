package dao;
import java.util.ArrayList;
import dto.Product;

public class ProductRepository {

	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
   private static ProductRepository instance = new ProductRepository();

   public static ProductRepository getInstance(){
	return instance;
   }

	public ProductRepository() {
		Product phone = new Product("P1234", "퓨마 퓨터 z1.4fg", 2490000);
		phone.setDescription("색상:FIERY코랄피지/라이트푸마블랙 품질보증:소비자 분쟁 해결 기준에 따름");
		phone.setCategory("축구화");
		phone.setManufacturer("퓨마");
		phone.setUnitsInStock(1000);
		phone.setCondition("New");
        phone.setFilename("P1234.jpg");

Product notebook = new Product("P1235", "미즈노 모렐리아 살라 클레식TF 풋살화", 99000);
		notebook.setDescription("6만원 이상 구매시 무료배송!");
		notebook.setCategory("풋살화");
		notebook.setManufacturer("미즈노");
		notebook.setUnitsInStock(1000);
		notebook.setCondition("Refurbished");
        notebook.setFilename("P1235.jpg");


		Product tablet = new Product("P1236", "아디다스 신발 가방", 9000);
		tablet.setDescription("90.000이상 구매시 무료증정");
		tablet.setCategory("잡화");
		tablet.setManufacturer("adidas");
		tablet.setUnitsInStock(1000);
		tablet.setCondition("Old");
        tablet.setFilename("P1236.jpg");

		
		// 위와 같이 상품 초기화 하고 아래에 상품을 추가

		listOfProducts.add(phone);
		listOfProducts.add(notebook);
		listOfProducts.add(tablet);
		// listOfProducts.add(상품명);
	}

	public ArrayList<Product> getAllProducts() {
		return listOfProducts;
	}
    public Product getProductById(String productId) {
		Product productById = null;

		for (int i = 0; i < listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			if (product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		return productById;
	}
       public void addProduct(Product product) {
	listOfProducts.add(product);
   }

}
