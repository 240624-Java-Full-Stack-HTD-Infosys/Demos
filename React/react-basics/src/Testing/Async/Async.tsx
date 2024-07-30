import React, { useEffect, useState } from 'react'

function Async() {
    const [posts, setPosts] = useState<[] | undefined>(undefined);
    const [errorMessage, setErrorMessage] = useState("");

    useEffect(() => {
        setErrorMessage("");
        fetch("https://jsonplaceholder.typicode.co/posts")
            .then((response) => response.json())
            .catch((error) => setErrorMessage(error.message))
            .then((data) => setPosts(data))
    }, [])



  return (
    <div>
        <h1>{errorMessage && errorMessage + " - Please try again"}</h1>
        <ul>
            { posts &&
                posts.map((post: any) => {
                    return (<li key={post.id}>{post.title}</li>);
                })
            }
        </ul>
    </div>
  )
}

export default Async