import React from 'react'
import ProductDisplay from './ProductDisplay';

interface Product{
    ProductId: number;
    Name: string;
    Price: number;
}

const DUMMY_ARRAY: Array<Product> = [
    {ProductId: 1, Name: "Banana", Price: 1.00},
    {ProductId: 2, Name: "Apple", Price: 1.00},
    {ProductId: 3, Name: "Orange", Price: 1.00},
    {ProductId: 4, Name: "Mango", Price: 3.00},
]

function ExerciseThree() {
  return (
    <>
        {
            DUMMY_ARRAY.map((product: Product) => {
                return (
                    <ProductDisplay product={product} key={product.ProductId}/>
                );
            })
        }
    </>
  )
}

export default ExerciseThree