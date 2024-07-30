import React from 'react'
import { User } from '../ContextExample'
import Sidebar from '../Sidebar/Sidebar'
import Profile from '../Profile/Profile'

interface DashboardProps {
    // user: User
}

function Dashboard({}: DashboardProps) {
  return (
    <div>
        <Sidebar/>
        <Profile/>
    </div>
  )
}

export default Dashboard