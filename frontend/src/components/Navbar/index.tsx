import { ReactComponent as GithubIcon } from "assets/img/github.svg";
import './style.css';
function Navbar() {
  return (
    <header>
      <nav className="container">
        <div className="gjsmovie-nav-content">
          <h1>GJSMovie</h1>
          <a href="https://github.com/Gabrielgjs">
            <div className="gjsmovie-contact-container">
              <GithubIcon />
              <p className="gjsmovie-contact-link">/Gabrielgjs</p>
            </div>
          </a>
        </div>
      </nav>
    </header>
  );
}

export default Navbar;
