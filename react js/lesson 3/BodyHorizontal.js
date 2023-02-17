import React from "react";
import Column1 from "./Column1";
import Column2 from "./Column2";
import Column3 from "./Column3";
import "./bodyHorizontal.css";

class BodyHorizontal extends React.Component {

    render() {
        return (
            <div className="container">
                <Column1 />
                <Column2 />
                <Column3 />
            </div>
        );
    }
}

export default BodyHorizontal;