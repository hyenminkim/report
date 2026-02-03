import { useEffect, useState } from 'react'
import axios from "axios";
function App() {
  const [framekList, setFramekList] = useState([])

 useEffect(() => {
        axios.get('http://localhost:8080/api/home')
            .then((res) => {
              console.log(res.data)  
              setFramekList(res.data);
            })
    }, []);
  return (
    <div>
      <h1>Framek 목록</h1>
      '테스트합니다 수정 ' 
      <ul>
        {framekList.map(framek => (
          <li key={framek.fkidx}>
            {framek.fkidx} / {framek.fname} 
          </li>
        ))}
      </ul>
    </div>
  )
}

export default App
