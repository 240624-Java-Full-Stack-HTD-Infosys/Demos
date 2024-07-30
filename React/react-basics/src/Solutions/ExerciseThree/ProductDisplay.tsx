import React from 'react'

function ProductDisplay({product}: any) {
  return (
    <div>
        <h2>{product.Name}</h2>
        <h5>{product.Price}</h5>
    </div>
  )
}

export default ProductDisplay