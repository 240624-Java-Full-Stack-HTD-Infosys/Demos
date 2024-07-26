import React from 'react';
import logo from './logo.svg';
import './App.css';
import {ComponentOne} from './Components/ComponentOne/ComponentOne';
import EventsDemo from './Components/EventsDemo/EventsDemo';
import ListDemo from './Components/ListDemo/ListDemo';
import Parent from './Components/Props/ParentComponent/Parent';
import { Route, Routes } from 'react-router-dom';
import NavBar from './Components/NavBar/NavBar';
import ExerciseOne from './Solutions/ExerciseOne/ExerciseOne';
import ExerciseTwo from './Solutions/ExerciseTwo/ExerciseTwo';
import Solutions from './Solutions/Solutions';
import Hooks from './Components/Hooks/Hooks';
import ClassComponent from './Components/ClassComponent/ClassComponent';

import {Parent as ParentState} from './Components/LiftingState/Parent/Parent';
import ContextExample from './Components/Context/ContextExample';

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
        <Route path='/hooks' element={<Hooks/>}></Route>
        <Route path='/class' element={<ClassComponent/>}></Route>
        <Route path='/lift' element={<ParentState/>}></Route>
        <Route path='/context' element={<ContextExample/>}></Route>
        <Route path='/solutions' element={<Solutions/>}></Route>
      </Routes>
    </div>
  );
}

export default App;

