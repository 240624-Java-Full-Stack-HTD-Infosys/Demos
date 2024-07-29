import React, { useContext } from 'react'
import { User } from '../ContextExample';
import { DashboardContext } from '../context';

interface SidebarProps {
    // user: User;
}
function Sidebar({}: SidebarProps) {
    const {user, setUser} : any | undefined = useContext(DashboardContext);
    
  return (
    <div>{user && user.email}</div>
  )
}

export default Sidebar