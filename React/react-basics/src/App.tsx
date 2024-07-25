import React from 'react';
import logo from './logo.svg';
import './App.css';
import {ComponentOne} from './Components/ComponentOne/ComponentOne';
import EventsDemo from './Components/EventsDemo/EventsDemo';
import ListDemo from './Components/ListDemo/ListDemo';
import Parent from './Components/Props/ParentComponent/Parent';
import { Route, Routes } from 'react-router-dom';
import NavBar from './Components/NavBar/NavBar';

function App() {
  return (
    <div className="App">
      <NavBar/>
      {/* <ComponentOne/> */}
      {/* <EventsDemo/> */}
      {/* <ListDemo/> */}
      {/* <Parent/> */}

      <Routes>
        <Route path="/" element={<ComponentOne/>}></Route>
        <Route path='/events' element={<EventsDemo/>}></Route>
        <Route path='/lists' element={<ListDemo/>}></Route>
        <Route path='/props' element={<Parent/>}></Route>
      </Routes>
    </div>
  );
}

export default App;

