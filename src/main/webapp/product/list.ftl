<style>
    table, th, td {
        border: 1px solid black;
        border-collapse: collapse;
    }
</style>

<div>
    <table>
        <tr>
            <th>Ürün</th>
            <th>Marka</th>
            <th>Birim Fiyatı</th>
            <th>Satın Al</th>
        </tr>

        <#list products as product>
            <tr>
                <td>${product.name}</td>
                <td>${product.brand.name}</td>
                <td>${product.price}</td>
                <td>
                    <a href="/checkout/${product.id?long?c}">
                        <button>Buy Now</button>
                    </a>
                </td>
            </tr>
        </#list>
    </table>
</div>