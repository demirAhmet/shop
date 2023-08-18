<div>
    <form action="/checkout" method="post" name="checkOutForm">

        <p>
            Sipariş Bilgisi : ${product.name}
            <br>
            Ürün Fiyatı : ${product.price}
        </p>

        <input type="hidden" name="totalProductValue" value="${product.price}">
        <input type="hidden" name="productId" value="${product.id?long?c}">

        <label for="clientName">Müşteri Adı : </label>
        <input type="text" id="clientName" name="clientName"><br>

        <label for="clientAddress">Müşteri Adresi : </label>
        <input type="text" id="clientAddress" name="clientAddress"><br>

        <label for="creditCardOwnerName">Kart Sahibinin Adı : </label>
        <input type="text" id="creditCardOwnerName" name="creditCardOwnerName"><br>

        <label for="creditCardNumber">Kart Numarası : </label>
        <input type="number" id="creditCardNumber" name="creditCardNumber"><br>

        <label for="creditCardOwnerName">Son Kullanma Tarihi : </label>
        <input type="number" id="creditCardExpireMonth" name="creditCardExpireMonth">
        <input type="number" id="creditCardExpireYear" name="creditCardExpireYear"><br>

        <label for="creditCardOwnerName">CVV : </label>
        <input type="number" id="creditCardCVVNumber" name="creditCardCVVNumber"><br>

        <label for="express">Gönderim seçeneği : </label>
        <input type="radio" id="express" name="shippingCode" value="EXPRESS">
        <label for="express">Express (+10 EUR)</label>
        <input type="radio" id="standart" name="shippingCode" value="STANDART">
        <label for="standart">Standart</label><br>
        <button type="submit">Buy Now</button>
    </form>
</div>