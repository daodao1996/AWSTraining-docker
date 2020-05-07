import React from 'react';
import './KeyWord.less';
import SearchButton from "./SearchButton";

class KeyWord extends React.Component{
    constructor (props){
        super(props);
        this.state = {
            employeeName: ''
        };
        this.changeState = this.changeState.bind(this);
    }

    changeState(ele){
        this.setState({employeeName: ele.target.value});
    }

    render() {
        return (
          <section>
            <input type="text" onChange={this.changeState}/>
            <SearchButton value="添加" keyword={this.state.employeeName}/>
          </section>
        );
    }
}

export default KeyWord;
