import classNames from "classnames/bind";
import styles from './dashboard.module.scss';

const cx = classNames.bind(styles);

function Dashboard() {
    return (
        <div className={cx('wrapper')}>
            Dashboard
        </div>
      );
}

export default Dashboard;