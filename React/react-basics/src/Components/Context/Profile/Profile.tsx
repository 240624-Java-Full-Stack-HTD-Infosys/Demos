import React, { useContext } from 'react'
import { User } from '../ContextExample';
import { DashboardContext } from '../context';

interface ProfileProps{
    // user: User;
}
function Profile({}:ProfileProps) {
    const user: User | undefined = useContext(DashboardContext)
  return (
    <div>
        {/* {user ? user.name : <></>} */}
        {user && user.name}
    </div>
  )
}

export default Profile