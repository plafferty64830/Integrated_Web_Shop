package wpd2.lab1.servlet;

/**
 * Created by Administrator on 21/02/2017.
 */

import lombok.Data;
import lombok.experimental.Accessors;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class SkuServlet extends BaseServlet {

   //private static final String SKU_TEMPLATE = "src/main/resources/webapp/Webstore.html";
    private static final String SKU_TEMPLATE = "Webstore.html";
    public SkuServlet() { }

    private Object getObject() {

        Sku sku =  new Sku("store/X5sc-1.jpg");
                sku.setId("skuId");
                sku.setUnitPrice("38.99");
                sku.setTitle(" Syma X5SC/X5SC-1 Falcon Drone HD 2.0MP Camera 4 Channel 2.4G Remote Control\n" +
                        " Quadcopter 6 Axis 3D Flip Fly UFO 360 Degree Eversion With 4GB SD Card (Black)");
                sku.setShortDescription("u6-Axis gyro quad-rotorcraft flight, strong stability,can easily implement various flight movements, stronger wind resistance, easier to control.");
                sku.setLongDescription("With Headless Mode function, the 6-axis system allows the quad to be hand launched.\n" +
                        " 2.4 technology adopted for anti-interference.even more than one quadcopter is flying at the same time they will not interfere with each other.\n" +
                        " The quadcopter can fly both indoor and outdoor.Including 4CH digital proportional RC system.\n" +
                        " Rechargeable 3.7V 500mAh high performance battery.");
        return sku;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        showView(response, SKU_TEMPLATE, getObject());

    }

    private static class SkuImage {
        private String name;

        protected String getName() {
            return name;
        }

        protected void setName(String name) {
            this.name = name;
        }
    }

    private static class Sku
    {
        private String id;
        private String unitPrice;
        private String title;
        private String shortDescription;
        private String longDescription;
        private SkuImage image;

        protected Sku(String imageName) {
            image = new SkuImage();
            image.setName(imageName);
        }

        protected String getId() {
            return id;
        }

        protected void setId(String id) {
            this.id = id;
        }

        protected String getUnitPrice() {
            return unitPrice;
        }

        protected void setUnitPrice(String unitPrice) {
            this.unitPrice = unitPrice;
        }

        protected String getTitle() {
            return title;
        }

        protected void setTitle(String title) {
            this.title = title;
        }

        protected String getShortDescription() {
            return shortDescription;
        }

        protected void setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
        }

        protected String getLongDescription() {
            return longDescription;
        }

        protected void setLongDescription(String longDescription) {
            this.longDescription = longDescription;
        }

        protected SkuImage getImage() {return image;}
    }

}