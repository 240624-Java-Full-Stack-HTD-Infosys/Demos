import React, { useState } from 'react'
import Dashboard from './Dashboard/Dashboard';
import { DashboardContext } from './context';

export interface User {
    name: string;
    email: string;
}

function ContextExample() {

    const [user, setUser] = useState<User>({
        name: "Brian",
        email: "brian@email.com"
    })

  return (
    <div>
        <DashboardContext.Provider value={{user, setUser}}>
            <Dashboard/>
        </DashboardContext.Provider>
    </div>
  )
}

export default ContextExample