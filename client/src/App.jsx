import React from 'react'
import "./App.css"
import {BrowserRouter,Routes,Route} from "react-router-dom";
import L from './ui/L';
import Card from './components/Card';
import Login from './pages/Login';
function App() {
  return (
    <>
    <BrowserRouter>
    <Routes>
      <Route path="/truck" element={<L/>}/>
      <Route path="/card" element={<Card/>}/>
      <Route path="/login" element={<Login/>}/>
    </Routes>
    </BrowserRouter>

    
    </>
  )
}

export default App